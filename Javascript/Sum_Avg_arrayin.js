// SUM & AVG OF ALL ELEMENTS IN ARRAY USING INTEGER ONLY

function sum_recursion(array) 
{
    if(i == 0)
    {
        return array[0];
    }
    else 
    {
        return array[i--] + sum_recursion(array);
    }
}

let array = [1,2,3,4,5];
let len = array.length;
let i = len - 1;
let sum_Array = sum_recursion(array);
let avg = sum_Array / len;

console.log("Sum of Array is = "+sum_Array);
console.log("Avg of Array is = "+avg);
