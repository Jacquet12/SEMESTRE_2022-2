#include<stdio.h>
#include<stdlib.h>

void print_sort(int vetor[], int n){
    for(int i = 0; i < n; i++){
        printf("%d ", vetor[i]);
    }
    printf("\n");
}

int inser_sort(int vetor[], int n){
    int position;
    int i, j;
    for(i = 1; i <= n-1; i++){
        position = vetor[i];
        for(j = i; j >= 1 && position < vetor[j-1]; j--){
            vetor[j] = vetor[j-1];
        }
        vetor[j] = position;

    }
    print_sort(vetor,n);
}



int main(){
    int n;
    scanf("%d", &n);
    int vetor[n];

    for(int i = 0; i < n; i++){
        scanf("%d", &vetor[i]);
    }
    print_sort(vetor, n);
    inser_sort(vetor, n);

}