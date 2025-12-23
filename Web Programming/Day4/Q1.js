 function getFactorialImpl(choice = "FORLOOP") {
    // Iterative version using a for loop
    function Fact1(n) {
        let result = 1;
        for (let i = 2; i <= n; i++) {
            result *= i; 
        }
        console.log(`Factorial of ${n} using FORLOOP is: ${result}`);
        return result;
    }  

    // Recursive version
    function Fact2(n) { 
        if (n === 0 || n === 1) {
            return 1;
        }
        return n * Fact2(n - 1);
    }
    if (choice === "RECUR") {
        return function(n) {
            const result = Fact2(n);
            console.log(`Factorial of ${n} using RECUR is: ${result}`);
            return result;
        };
    } else {
        return Fact1;
    }
}

let rv = getFactorialImpl("RECUR");
rv(3);  

rv = getFactorialImpl();  
rv(5);  
