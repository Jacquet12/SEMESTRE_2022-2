#include<stdio.h>
#include<stdlib.h>

void printBubblesort(int vetor[], int n){
    for(int i = 0; i < n; i++){
        printf("%d ", vetor[i]);
    }
    printf("\n");
}

void bubble(int vetor[], int n){
    int i, j;
    int aux;

    for(i = n-1; i>=1; i--){
        for(j=0; j <= i-1; j++){
            if(vetor[j] > vetor[j+1]){
                aux = vetor[j];
                vetor[j] = vetor[j+1];
                vetor[j+1] = aux;
            }
            printBubblesort(vetor,n);
        }
    }
    printBubblesort(vetor,n);
}



int main(){
    int n, c;
    scanf("%d", &n);
    int vetor[n];
    for(int i = 0; i <  n; i++){
        scanf("%d", &vetor[i]);
    }
    printBubblesort(vetor,n);
    bubble(vetor, n);
   
   
   return 0;

}






