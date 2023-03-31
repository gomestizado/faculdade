#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


typedef struct sPonto{
    int info;
    struct sPonto *prox;
} Ponto;

typedef struct sListaSimples{
    Ponto *prim;
} ListaSimples;

void criarLista(ListaSimples *pList){
    pList->prim = NULL;
}

void consultar(ListaSimples *pList){
    Ponto *p;
    printf("Lista: ");
        for (p = pList->prim; p != NULL; p = p->prox){
            printf("%d ->", p->info);
}
    printf("NULL\n");
}

void insInicial(ListaSimples *pList, int v){
    Ponto *novo;
    novo = (Ponto*)malloc(sizeof(Ponto));
    if (novo != NULL){
        novo->info = v;
        novo->prox = pList->prim;
        pList->prim = novo;
    }   else{
            printf("Memória Insuficiente\n");
          }
}

void remInicial(ListaSimples *pList){
    Ponto *pAux = pList->prim;
    if (pAux != NULL){
        pList->prim = pList->prim->prox;
        free(pAux);
        printf("Valor Removido\n");
    }
    else{
        printf("Lista Vazia\n");
    }
}

void insNaOrdem(ListaSimples *pList, int v){
    Ponto *novo;
    novo = (Ponto*)malloc(sizeof(Ponto));
    if (novo != NULL){
        novo->info = v;
        Ponto *pAtu, *pAnt;
        pAnt = NULL;
        pAtu = pList->prim;
     while (pAtu != NULL && pAtu->info < v){
         pAnt = pAtu;
         pAtu = pAtu->prox;
    }
         novo->prox = pAtu;
        if (pAnt != NULL){
            pAnt->prox = novo;
        }
        else{
         pList->prim = novo;
         }
    }
    else{
         printf("Memória Insuficiente\n");
    }
}

void remEspecifico(ListaSimples *pList, int v){
    Ponto *pAtu, *pAnt;
    pAnt = NULL;
    pAtu = pList->prim;
    while (pAtu != NULL && pAtu->info != v){
        pAnt = pAtu;
        pAtu = pAtu->prox;
    }
    if (pAnt != NULL){
         if (pAtu != NULL) {
             pAnt->prox = pAtu->prox;
             free(pAtu);
             printf("Valor removido\n");
         }
         else{
             printf("Valor não encontrado\n");
         }
    }
    else{
        printf("Lista Vazia\n");
    }
}

void remTudo(ListaSimples *pList){
    Ponto *pAux = pList->prim;
    if (pAux != NULL){
         while (pAux != NULL){
             pList->prim = pAux->prox;
             free(pAux);
             pAux = pList->prim;
         }
     printf("Todos os elementos foram removidos!\n");
     }
     else{
         printf("Lista Vazia\n");
     }
}

void altElemento(ListaSimples *pList, int v1, int v2){
    Ponto *pAtu, *pAnt;
    pAnt = NULL;
    pAtu = pList->prim;
    while (pAtu != NULL && pAtu->info != v1){
        pAnt = pAtu;
        pAtu = pAtu->prox;
    }
    if (pAnt != NULL){
        if (pAtu != NULL){
            pAtu->info = v2;
            printf("Valor alterado!\n");
        }
        else{
            printf("Valor não encontrado.\n");
        }
    }
    else{
         printf("Lista Vazia.\n");
    }
}

int estaVazia(ListaSimples *pList) {
    return(pList->prim == NULL);
}

void main(){
    setlocale(LC_ALL, "portuguese");
    ListaSimples minhaLista;
    int valor, op, valorAlt;
    criarLista(&minhaLista);
    printf("AVA1 - ESTRUTURA DE DADOS\n");
    printf("MATHEUS GOMES\n\n");
    printf("Escolha uma opção:\n");
    while (1) {
        printf("\n(1) Incluir elemento no início\n");
        printf("(2) Incluir elemento em ordem\n");
        printf("(3) Alterar elemento\n");
        printf("(4) Remover elemento do início\n");
        printf("(5) Remover elemento específico\n");
        printf("(6) Remover todos os elementos\n");
        printf("(7) Mostrar lista\n");        
        printf("(0) Sair\n");
        scanf("%d", &op);
        system("cls");
            switch (op) {
                case 1: //Incluir elemento no início
                    printf("Valor: ");
                    scanf("%d", &valor);
                    insInicial(&minhaLista, valor);
                    break;
                case 2: //Incluir elemento em ordem
                    printf("Valor: ");
                    scanf("%d", &valor);
                    insNaOrdem(&minhaLista, valor);
                    break;
                case 3: //Alterar elemento
                    printf("Valor a ser alterado: ");
                    scanf("%d", &valor);
                    printf("Novo valor: ");
                    scanf("%d", &valorAlt);
                    altElemento(&minhaLista, valor, valorAlt);
                    break;
                case 4: //Remover elemento do início
                    remInicial(&minhaLista);
                    break;
                case 5: //Remover elemento específico
                    printf("Qual o valor? ");
                    scanf("%d", &valor);
                    remEspecifico(&minhaLista, valor);
                    break;
                case 6: //Remover todos os elementos
                    remTudo(&minhaLista);
                    break;
                case 7: //Mostrar lista
                    if (estaVazia(&minhaLista)) {
                         printf("Lista vazia!\n");
                    }
                    else {
                         consultar(&minhaLista);
                    }
                    break;
                case 0: //Sair
                    remTudo(&minhaLista);
                    exit(0);
                default:
                    printf("Opção inexistente!\n");
                }
    }
}

