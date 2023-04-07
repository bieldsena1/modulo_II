
var salarioLarissa = 2000;
var salarioMaria = 5000;
var salarioJonas = 1000;
var salarioFrancisco = 3000;
var reajuste = 10;
var valorReajuste;
var salarioReajustado;


valorReajuste = salarioLarissa * reajuste / 100;
salarioReajustado = salarioLarissa + valorReajuste;
console.log("Larissa ganha R$" + salarioLarissa + ", com reajuste de 10% passa a ganhar R$" + salarioReajustado);

valorReajuste = salarioMaria * reajuste / 100;
salarioReajustado = salarioMaria + valorReajuste;
console.log("Maria ganha R$" + salarioMaria + ", com reajuste de 10% passa a ganhar R$" + salarioReajustado);

valorReajuste = salarioJonas * reajuste / 100;
salarioReajustado = salarioJonas + valorReajuste;
console.log("Jonas ganha R$" + salarioJonas + ", com reajuste de 10% passa a ganhar R$" + salarioReajustado);

valorReajuste = salarioFrancisco * reajuste / 100;
salarioReajustado = salarioFrancisco + valorReajuste;
console.log("Francisco ganha R$" + salarioFrancisco + ", com reajuste de 10% passa a ganhar R$" + salarioReajustado);