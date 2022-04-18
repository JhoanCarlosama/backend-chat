package com.bolsadeideas.springboot.backend.chat.models.service;

import com.bolsadeideas.springboot.backend.chat.models.documents.Mensaje;

import java.util.List;

public interface ChatService {

    public List<Mensaje> obtenerUltimos10Mensajes();

    public Mensaje guardar(Mensaje mensaje);
}
