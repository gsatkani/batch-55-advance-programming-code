const employee = {
    id: 101,
    name: 'Siva K',
    salary: 25000.50,
    company: 'Wipro',
    address: {
        houseno: "115",
        city: 'Chennai'
    }
}

console.log(employee.id)
console.log(employee.name)
console.log(employee.salary)
console.log(employee.company)

employee.age = 23

console.log(employee.age)
console.log(employee.address.houseno)
console.log(employee.address.city)