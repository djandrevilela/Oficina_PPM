

object TipoAvaria extends Enumeration {

  type TipoAvaria = Value
  val BATERIA, FUSIVEIS, VELAS, ALTERNADOR, MOTORES_ELETRICOS, IGNICAO, ALMOGADELAS, ALINHAMENTO_CHASSI, LAVAR, SUSPENSAO, PINTAR_PAINEL, PINTAR_EXTERIOR, PINTAR_INTEIOR, MOTOR, ARCONDICIONADO, TRANSMISSAO, DIRECAO, RODA, RADIADOR, ESCAPE, ESTOFOSFRENTE, ESTOFOSTRAS, ESTOFOSPORTA, ESTOFOSBAGAGEM, TROCA_DE_VIDRO, CARPETES, OBSERVACAO, PRONTO = Value

  final def maxID: Int = 26

}

