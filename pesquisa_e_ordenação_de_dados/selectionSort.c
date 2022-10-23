#include<stdio.h>
#include<stdlib.h>

void print_sort(int vetor[], int n){
    for(int i = 0; i < n; i++){
        printf("%d ", vetor[i]);
    }
    printf("\n");
}

int selection_Short(int vetor[], int n){
    int miniposition;
    int i, j, aux;
    for(i = 0; i < n-1; i++){
        miniposition = i;
        for(j = i+1; j<= n-1; j++){
            if(vetor[j] < vetor[miniposition]){
                miniposition = j;
            }
        }
        aux = vetor[i];
        vetor[i] = vetor[miniposition];
        vetor[miniposition] = aux;

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
    selection_Short(vetor, n);

}