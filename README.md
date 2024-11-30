# Análise Comparativa de Algoritmos com Uso de Paralelismo

## Resumo

Este trabalho propõe uma análise detalhada do desempenho de diferentes algoritmos de busca em ambientes seriais e paralelos, utilizando a linguagem de programação Java. A busca por eficiência computacional é essencial em diversas aplicações, e entender como diferentes algoritmos se comportam em cenários distintos de processamento é crucial. São analisadas três versões de busca: serial, paralela em CPU e paralela em GPU.

A análise utiliza textos como dados de entrada para contar ocorrências de uma palavra específica. Os resultados, como contagem e tempos de execução, são registrados em arquivos CSV, permitindo visualização através de gráficos ou processamento adicional em Java.

---

## Introdução

Este projeto implementa e compara três métodos de busca de palavras em textos:

- **Método SerialCPU**: Itera sequencialmente sobre cada palavra do texto para contar as ocorrências.
- **Método ParallelCPU**: Divide o texto em partes e utiliza threads para realizar a contagem em paralelo.
- **Método ParallelGPU**: Utiliza OpenCL para realizar a contagem de palavras na GPU, explorando o paralelismo em hardware gráfico.

A principal motivação é investigar como diferentes abordagens impactam o desempenho em diferentes tamanhos e tipos de dados.

---

## Metodologia

1. **Implementação de Algoritmos**: Desenvolvimento dos métodos de busca sequenciais e paralelos em Java.
2. **Framework de Teste**: Criação de um framework que executa os algoritmos e registra o tempo de execução.
3. **Execução em Ambientes Variados**: Testes realizados em diferentes tamanhos de textos para observar variações no desempenho.
4. **Registro de Dados**: Salvamento dos resultados em arquivos CSV para análises posteriores.
5. **Análise Estatística**: Estudo dos resultados para identificar padrões de desempenho.

### Configurações de Teste

- Textos de tamanhos variados.
- Três execuções para cada algoritmo em cada cenário.
- Ajuste no número de núcleos de processamento nas execuções paralelas.

### Tecnologias Utilizadas

- **Linguagem**: Java
- **Bibliotecas**: JOCL 2.0.4
- **Gráficos**: Swing, JUPITER ou PrimeFaces (JSF)

---

## Resultados e Discussão

Os resultados mostraram diferenças significativas no tempo de execução entre os métodos. Seguem exemplos de saídas esperadas:

**SerialCPU**: 66 ocorrências em 133 ms

**ParallelCPU**: 66 ocorrências em 82 ms 

**ParallelGPU**: 119 ocorrências em 2705 ms


### Gráficos

Os resultados são representados por gráficos comparativos, mostrando como o desempenho varia de acordo com o tamanho do texto e a configuração de execução.

---

## Conclusão

Os resultados evidenciam que algoritmos paralelos podem oferecer ganhos de desempenho significativos em determinadas condições. No entanto, o método paralelo em GPU nem sempre é o mais eficiente para textos menores, destacando a importância de escolher a abordagem correta com base no contexto e nos recursos disponíveis.

---

## Referências

1. Documentação da biblioteca JOCL: [JOCL](http://www.jocl.org/)
2. Livros e artigos sobre computação paralela e distribuída.

---

## Anexos

### Código-Fonte

O código completo está disponível no GitHub no link abaixo:

[Link do Projeto no GitHub](https://github.com/henriquefac/demo-computacao-grafica)

### Notas sobre Bibliotecas

Caso o projeto exija alguma biblioteca específica, como JOCL, certifique-se de instalá-la corretamente seguindo a documentação oficial.

---

**IMPORTANTE**: Enviar um arquivo TXT com o link do GitHub onde o projeto está hospedado.
