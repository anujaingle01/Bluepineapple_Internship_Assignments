function push(element) {
      
    if(stacktop + 1 < MAX) {
    array.push(element);
    stacktop = stacktop + 1;   
        console.log("Element "+element+" is push to stack");
    }
    else{
    isFull();
    }
}
function pop() {

    if(stacktop == -1) {
    isEmpty();
    }
    else{
    console.log("Element "+array.pop()+" is pop from stack");
    stacktop = stacktop - 1;
    }
}
function isFull() {
    if(stacktop + 1 == MAX) {
    console.log("Stack is Full");  
    } else {
    console.log("Stack is not Full");
    }
}
function isEmpty() {
    if(stacktop == -1) {
    console.log("Stack is Empty");
    } else {
    console.log("Stack is not Empty");
    }
}
function peek() {
    console.log("top = "+stacktop);
}
function isExist(element) {
    array.forEach(item => {
        if(element === item)
        {
            console.log(element+" is exist");
        }
        else {
            console.log(element+" is not exist")
        }
    })
}
var MAX = 5;
var array = [];

var stacktop = -1;

push(1);
push(2);
push(3);
push(4);
isFull();
push(5);
push(6);
isExist(6);
isExist(5);
peek();
isEmpty();
pop();
pop();
pop();
peek();
pop()
pop();
pop();
peek();
