/*input: 3 vo chai-> 1 chai moi
case1: 3->1
case2: 5->1 => 3:1
*/

const Solution = (n) => {
    for (let i = 1; i <= n; i++) {
        if (i % 3 === 0) {
            n++
        }
    }
    return n
}

console.log(Solution(200))