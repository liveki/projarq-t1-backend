package com.bcopstein.aplicacao.servicos;

import java.time.LocalTime;

public class RestricaoVendaFactory {
  private static final LocalTime HORARIO_NORMAL = LocalTime.of(18, 0, 0);

  public IRestricaoHorarioVenda getInstance() {
    if (LocalTime.now().isBefore(HORARIO_NORMAL)) {
      return new HorarioNormal();
    } else {
      return new HorarioPertoDoLimite();
    }
  }
}
