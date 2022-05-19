const city = ['Chennai', 'Pune', 'Goa', 'Vizag', 'Hyderbad']

city.sort((a, b) => a.localeCompare(b))
console.log(city)
let size = city.push('Bengaluru') //Appends new elements to the end of an array, and returns the new length of the array.

console.log(size)

city.pop() //Removes the last element from an array and returns it.
console.log(city)


let firstEle = city.shift() //Removes the first element from an array and returns it.
console.log(firstEle)

city.unshift('Ernakulam') // Inserts new elements at the start of an array, and returns the new length of the array.

console.log(city)

let list = city.slice(0, 3)
console.log(list)

console.log(city.splice(0, 3))
console.log(city)