let list = [10, 33, 56, 76, 12, 23, 45, 54, 78, 99]


let even = list.filter((x) => {
    return x % 2 == 0
})
console.log(even)

let plusTen = list.map((x) => x + 10)
console.log(plusTen)


let firstElementDivisibleByThree = list.find(x => x % 3 == 0)

console.log(firstElementDivisibleByThree)

// string methods