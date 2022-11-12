#include<stdio.h>
#include<stdlib.h>
#include <math.h>


// void printBubblesort(int vetor[], int n){
//     for(int i = 0; i < n; i++){
//         printf("%d ", vetor[i]);
//     }
//     printf("\n");
// }

int particiona(int vetor[], int inicio, int fim){
    int j = fim;
    int k = inicio;
    int aux2;
    for (int i = inicio; i < fim; i ++){
        int aux = vetor[i];
        if (vetor[i] <= vetor[j]){
            vetor[i] = vetor[k];
            vetor[k] = aux;
            k++;
        }
        aux2 = vetor[k];

    }
    if (vetor[k] > vetor[j]){
        vetor[k] = vetor[j];
        vetor[j] = aux2;
        j = k;
    }
    return j;
}

void Quick_Sort(int vetor[], int inicio, int fim ){
    if(inicio < fim){
        int j = particiona(vetor[fim-1], inicio, fim); 
        Quick_Sort(vetor, inicio, j-1);
        Quick_Sort(vetor, j+1, fim);
    }
}

 int main(){
    int n, fim;
//     scanf("%d", &n);
    int vetor[fim];
//     for(int i = 0; i <  n; i++){
//         scanf("%d", &vetor[i]);
//     }
//     printBubblesort(vetor,n);
//     bubble(vetor, n);
   
   
    return 0;

}






