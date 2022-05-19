const no1 = document.getElementById('firstNo')
const no2 = document.getElementById('secondNo')
const res = document.getElementById('result')

function addition() {

    let x = no1.value
    let y = no2.value
        // ES6 Javascript Version
    alert(`${x} -- ${y}`) // Backtick symbol

    let result = Number(x) + Number(y)
    alert("Sum of two Numbers " + result)
    res.innerHTML = `Sum of Two Numbers ${result}`

}