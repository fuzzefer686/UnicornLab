#include <stdio.h>
#include <stdlib.h>
typedef struct node node;
struct node{
    void *data;
    int datatype;
    node *next;
};
node* createNewNode(void *datain,int siz){
    node *link = (node*)malloc(sizeof(node));
    link->data=&datain;
    link->datatype=siz;
    link->next = NULL;
    return link;
}
typedef struct {
    node* next;
} linkedList;
void createList(linkedList *l){
    l->next=NULL;
}
void addNode(linkedList *l, node* node){
    l->next=node;
}
int main(){
    linkedList l;
    createList(&l);
    int n=10;
    char c='a';
    char s[30]="23sfp";
    // add n
    node* newNode = (node*)malloc(sizeof(node));
    newNode->data=&n;
    newNode->datatype=sizeof(n);
    newNode->next=NULL;
    addNode(&l,newNode);
    free(newNode);
    // add c
    // node* newNode = (node*)malloc(sizeof(node));
    newNode->data=&c;
    newNode->datatype=sizeof(c);
    newNode->next=NULL;
    addNode(&l,newNode);
    free(newNode);
    // add s
    // node* newNode = (node*)malloc(sizeof(node));
    newNode->data=&s;
    newNode->datatype=sizeof(c);
    newNode->next=NULL;
    addNode(&l,newNode);
    free(newNode);
}