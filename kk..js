const Solution = (n) => {
    let total = n
    let bottles = n

    while (bottles >= 3) {
        let exchange = Math.floor(bottles / 3)
        total += exchange
        bottles = exchange + bottles % 3
    }
    return total
}

console.log(Solution(200))