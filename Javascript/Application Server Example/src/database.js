const h2 = document.getElementById('demo')


setTimeout(() => {
    h2.innerHTML = "Data fetched from Mysql Server - 10 secs"
}, 10000)


document.querySelector('h3').innerHTML = "Asynchronous code"