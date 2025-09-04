"""
CONSTANTE = "Variáveis" que não vão mudar
Muitas condições no mesmo if (ruim)
    <- Contagem de complexidade (ruim)
"""
velocidade = 61 # velocidade atual do carro
local_carro = 100 # local em que o carro está na estrada

RADAR_1 = 60 # velocidade máxima do radar 1
LOCAL_1 = 99 # local onde o radar 1 está
RADAR_RANGE = 1 # A distância onde o radar pega

velocidade_carro_passou_radar1 = velocidade > RADAR_1 # Verifica se a velocidade do carro está acima da velocidade permitida pelo Radar.
Radar1_Range99 = LOCAL_1 - RADAR_RANGE # Mostra o Range atrás do Radar (99)
Radar1_Range101 = LOCAL_1 + RADAR_RANGE # Mostra o Range na frente do Radar (101)
carro_passou_radar1 = local_carro >= (Radar1_Range99) and \
  local_carro <= (Radar1_Range101) # Verifica se o carro está no Range do Radar.
carro_multado_radar1 = carro_passou_radar1 and velocidade_carro_passou_radar1 # Multa o carro se o carro estiver no Range do Radar e a velocidade do carro for acima da velocidade permitida.

if velocidade_carro_passou_radar1: # Mostra se o carro passou da velocidade máxima do radar.
  print('O Carro excedeu o límite de velocidade do radar 1.')

if carro_passou_radar1:
  print('O Carro passou no radar 1. ')

if carro_multado_radar1: #Mostra se o carro estiver sido multado.
  print('O Carro foi multado no radar 1.')