function calculate(...a) {
    console.log("From calculate function");


    //variable setup
    let sum = 0; //initializing sum =0
    let oddNumbers = [];//empty array that will store only odd numbers

    for (let i = 0; i < a.length; i++) {
        sum += a[i];                  // calculate sum //addition gets stored in a variable "sum"

        if (a[i] % 2 !== 0) {         // checks whether odd or not 
            oddNumbers.push(a[i]);    //if odd then push odd numbers
        }
    }

    console.log("Addition of " + a.length + " numbers = " + sum);

    if (oddNumbers.length > 0) {
        console.log("The odd numbers are: " + oddNumbers.join(", "));
        //join only combines array elements  to string
        //does not add much .It is same if not written join but just adds space after comma [", " (comma + space).]

    }
    
    else {
        console.log("No odd numbers found.");
    }
}

calculate(1, 20, 3, 12, 23, 34);
calculate(8,9,6,7);
