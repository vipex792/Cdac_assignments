let a = ["HTML", "CSS", "JS"];

let num = 5;
switch (num) {

    case 1:
        a.push("Node.js");
        console.log(a);
        break;

    case 2:
        a.unshift("Web Development");
        console.log(a);
        break;

    case 3:
        console.log("Original Array: " + a);
        break;

    case 4:
        let lst = a.pop();
        console.log("After Removing the last: " + a);
        break;

    case 5:
        let fst = a.shift();
        console.log("After Removing the First: " + a);
        break;

    case 6:
        a.splice(1, 2);
        console.log("After Removing 2 elements starting from index 1: " + a);
        break;

    case 7:
        for (let i = 0; i < a.length; i++) {
            console.log(a[i]);
            break;
        }

    case 8:
        console.log(a.toString());
        break;

} 
