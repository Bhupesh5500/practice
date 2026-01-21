#include<stdio.h>
#define MAX 5
int queue[MAX];
int front=-1,rear=-1;

//makeing Empty queue
void makeEmpty(){
    front=-1;
    rear=-1;
}
//check if queue is empty
int isEmpty(){
    return (front==-1 || front>rear);
}

//checking is quque is full
int isFull(){
    return (rear==MAX-1);
}

//adding elements in queue
void enquque(int x){
    if(isFull()){
        printf("Queue Overflow\n");
    }
    else{
        if(front==-1){
            front=0;
        }
        rear++;
        queue[rear]=x;
        printf("%d is added to queue\n",x);
    }
}

//removing elements from quque
void dequque(){
    if(isEmpty()){
        printf("Queue Underflow\n");
    }
    else{
        printf("%d is removed from queue\n",queue[front]);
        front++;
    }
}

//displaying elements of quque(front element)
int getfront(){
    if(isEmpty()){
        printf("Queue is empty\n");
        return -1;
    }
    else{
        return queue[front];
    }
}

//displaying elements of quque(rear element)
int getrear(){
    if(isEmpty()){
        printf("Queue is empty\n");
        return -1;
    }
    else{
        return queue[rear];
    }
}

//displaying all elements of quque
void display(){
    if(isEmpty()){
        printf("Queue is empty\n");
    }
    else{
        printf("Queue elements are: ");
        for(int i=front;i<=rear;i++){
            printf("%d ",queue[i]);
        }
        printf("\n");
    }
}

int main(){
    makeEmpty();
    enquque(10);
    enquque(20);
    enquque(30);
    display();
    printf("Front element: %d\n",getfront());
    printf("Rear element: %d\n",getrear());
    dequque();
    display();
    return 0;
}