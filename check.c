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

//checking is queue is full
int isFull(){
    return (rear==MAX-1);
}

//adding elements in queue
void enqueue(int x){
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

//removing elements from queue
void dequeue(){
    if(isEmpty()){
        printf("Queue Underflow\n");
    }
    else{
        printf("%d is removed from queue\n",queue[front]);
        front++;
    }
}

//displaying elements of queue(front element)
int getfront(){
    if(isEmpty()){
        printf("Queue is empty\n");
        return -1;
    }
    else{
        return queue[front];
    }
}

//displaying elements of queue(rear element)
int getrear(){
    if(isEmpty()){
        printf("Queue is empty\n");
        return -1;
    }
    else{
        return queue[rear];
    }
}

//displaying all elements of queue
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
    enqueue(10);
    enqueue(20);
    enqueue(30);
    display();
    printf("Front element: %d\n",getfront());
    printf("Rear element: %d\n",getrear());
    dequeue();
    display();
    return 0;
}