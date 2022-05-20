// Arrow Function
let areaCircle = (radius) => {
    return 3.14 * radius * radius
}

let areaRect = (length, bredth) => {
    return length * bredth
}

//A callback function is a function passed into another function as an argument
// pass function areaCircle / areaRect to another shape
shape(areaCircle, areaRect)

function shape(circle, rectangle) { // circle /  rectangle are call back functions
    console.log("Area of Circle " + circle(12))
    console.log("Area of Reactangle " + rectangle(1.2, 4.5))

}