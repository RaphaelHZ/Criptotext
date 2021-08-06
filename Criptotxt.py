#importa a biblioteca para trabalhar com URL
from urllib.request import urlopen

#abre o arquivo de texto armazenado no GITHUB (neste caso está pegando ele em formato raw)
arquivo = urlopen("https://raw.githubusercontent.com/RaphaelHZ/Criptotext/main/Frase_Encriptada.TXT").read()

#transforma ele de RAW para String, substitue o \n por nova linha e os demais caracteres trocados
arquivo = str(arquivo).replace('\\n', '\n').replace("4", "a").replace("3", "e").replace("1", "i").replace("0", "o").replace("7", "u")

#imprime na tela
print(arquivo)

#Entidade: Unifil EAD
#Nome: Raphael Henrique Zanluqui
#Data: 06-08-2021 11:00
#Objetivo: Ler arquivo TXT e descriptar seu conteudo