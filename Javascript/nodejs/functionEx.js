// function declaration
function addition(x, y) {
    return x + y
}
let sum = addition(10, 20);
console.log("Sum of Two Numbers " + sum)
    // to run ==> node functionEx.js
let diff = subtraction(10, 20);
console.log("Difference of Two Numbers " + diff)

function subtraction(x, y) {
    return x - y
}

// Function expression - function without name / unnamed function / 
let mul = function(x, y) {
    return x * y
}
console.log(`Multiplication of Two numbers ${mul(12,3.4)}`)

// Arrow Function  - ES6 version
let div = (x, y) => {
    return x / y
}
console.log(`Division of Two numbers ${div(12,3)}`)