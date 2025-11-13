class Sessao:
    def __init__(self, numeroCelular, dadosSessao):
        self.numeroCelular = numeroCelular
        self.dadosSessao = dadosSessao
        
    def __str__(self):
        return f"Sessão{{numeroCelular={self.numeroCelular}, dadosSessao={self.dadosSessao}}}"