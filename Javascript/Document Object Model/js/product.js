//alert("Welcome")
const pname = document.getElementById("product")
const button = document.querySelector("button")
const ul = document.querySelector("ul")
const span = document.createElement("span")
ul.className = "list-group list-group-flush"
button.addEventListener("click", () => {
    let productName = pname.value
    if (productName == '') {
        pname.focus()
        alert("Product Name Should not be Empty")
        span.innerText = "Product Name Should not be Empty"
        document.body.appendChild(span)
        return false
    }
    let li = document.createElement("li")
    li.className = "list-group-item"
    let p = document.createElement("p")
    p.textContent = productName
    p.style.color = 'green'
    p.style.padding = '5px'
        //p.style.backgroundColor = 'yellow'
    let deleteButton = document.createElement("button")
    deleteButton.textContent = 'Delete'
    deleteButton.style.marginLeft = '40px'
    deleteButton.className = "btn btn-danger"
    p.appendChild(deleteButton)
    li.appendChild(p)
    ul.appendChild(li)

    span.innerText = ""

    deleteButton.addEventListener("click", () => {
        ul.removeChild(li)
    })

})

span.innerText = ""