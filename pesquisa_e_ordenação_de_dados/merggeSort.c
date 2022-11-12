#include<stdio.h>
#include<stdlib.h>
#include <math.h>


void intercalar (int vetor[], int inicio, int meio, int fim){
    //int tamanho = fim - inicio+1;
    int *auxiliar;
    int i = inicio;
    int j = meio + 1;
    int k = 0;

    auxiliar = calloc((fim - inicio+1),sizeof(int));

    while(i <= meio && j <= fim){
        if(vetor[i] <= vetor[j]){
            auxiliar[k] = vetor[i];
            i++;
        }else{
            auxiliar[k] = vetor[j];
            j++;
        }
        k++;
    }

    while (i <= meio){
        auxiliar[k] = vetor[i];
        k++;
        i++;
    }

    while (j <= fim){
        auxiliar[k] = vetor[j];
        k++;
        j++;
    }

    for(k = inicio; k <= fim; k++){
        vetor[k] = auxiliar[k-inicio];
    }

    free (auxiliar);

}


void mergeSort(int vetor[], int inicio, int fim){
    int meio;
    if (inicio < fim){
        meio = floor((inicio + fim)/2);
        mergeSort (vetor, inicio, meio);
        mergeSort (vetor, meio+1, fim);
        intercalar(vetor, inicio, meio, fim);
    }
}


void printF(int vetor[], int fim){
     for(int i = 0; i <= fim-1; i++){
        printf("%d ",vetor[i]);
    }
    printf("\n");
}



int main(){
    int  inicio = 0, fim;
    printf("Digite o valor do fim\n");
    scanf("%d", &fim);

    int vetor[fim];

    printf("Digite os valores\n");
    for(int i = inicio; i < fim; i++){
        scanf("%d", &vetor[i]);
    }

    printF(vetor, fim);
    mergeSort(vetor,inicio,fim-1);
    printF(vetor, fim);
    
    return 0;

}