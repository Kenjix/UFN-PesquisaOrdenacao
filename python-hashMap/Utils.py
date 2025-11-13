from Sessao import Sessao

class Utils:
    def carregarSessoes(self, caminho):
        sessoes = {}
        with open(caminho, 'r', encoding='utf-8') as arquivo:
            for linha in arquivo:
                linha_limpa = linha.strip()
                if not linha_limpa:
                    continue
                separador = linha_limpa.split(";", 2)
                numeroCelular = separador[0]
                dadosSessao = separador[1]

                sessao = Sessao(numeroCelular, dadosSessao)
                sessoes[numeroCelular] = sessao
        return sessoes