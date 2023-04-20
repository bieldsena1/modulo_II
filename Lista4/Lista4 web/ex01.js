
const contaCorrente = {
  saldo: 1000,
  faturaAtual: 500,
  creditoDisponivel: 1000,
  extrato: {
    entrada: [
      { data: "10/04/2023", valor: 200 },
      { data: "12/04/2023", valor: 50 },
      { data: "15/04/2023", valor: 150 },
    ],
    saida: [
      { data: "11/04/2023", valor: 100, descricao: "Restaurante" },
      { data: "13/04/2023", valor: 30, descricao: "Cinema" },
      { data: "14/04/2023", valor: 80, descricao: "Mercado" },
    ],
  },
  exibirExtrato: true
};

if (contaCorrente.saldo >= contaCorrente.faturaAtual) {
  console.log("Você possui saldo para pagar a fatura atual");
} else {
  console.log("Você não possui saldo suficiente para pagar a fatura, experimente pegar crédito para conseguir pagar. Crédito disponível: " + contaCorrente.creditoDisponivel);
}

if (contaCorrente.exibirExtrato) {
  console.log("Entradas:");
  for (let i = 0; i < contaCorrente.extrato.entrada.length; i++) {
    console.log("Data: " + contaCorrente.extrato.entrada[i].data + " | Valor: " + contaCorrente.extrato.entrada[i].valor);
  }
  
  console.log("Saídas:");
  for (let i = 0; i < contaCorrente.extrato.saida.length; i++) {
    console.log("Data: " + contaCorrente.extrato.saida[i].data + " | Valor: " + contaCorrente.extrato.saida[i].valor + " | Descrição: " + contaCorrente.extrato.saida[i].descricao);
  }
}