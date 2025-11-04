let sumOfMultiplesOfFour = 0;
let sumOfMultiplesOfEight = 0;

for(let count = 4; count <= 1024; count*= 4){
	sumOfMultiplesOfFour += count

}
for(let count = 8; count <= 32789; count*= 8){

	sumOfMultiplesOfEight += count

}
console.log(sumOfMultiplesOfFour +  sumOfMultiplesOfEight)
