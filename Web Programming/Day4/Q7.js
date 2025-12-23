const array = [10,5,20,8,15];
let largest = array[0];

array.forEach(element=>{
    if (element>largest){
        largest = element;
    }
});
console.log("Largest element: ", largest);


// function largestElement(arr) {
//     let largestNum = arr[0];
//     for (let i = 1; i < arr.length; i++) {
//         if (arr[i] > largestNum) {
//             largestNum = arr[i];
//         }
//     }
//     return largestNum;
// }

// const num1 = [10, 15, 18, 20, 23];
// const result = largestElement(num1);

// console.log("The largest element in the array is:" + result);





// function findLargest(arr) {

//     arr.sort((a, b) => a - b); // Sort the array in ascending order

//     return arr[arr.length - 1]; // Return the last element
// }

// let arr = [10, 5, 20, 8];

// // 5 10 20 8 
// //5 10 8 20
// // 5 8 10 20
// console.log("Largest element in the array is:", findLargest(arr));





