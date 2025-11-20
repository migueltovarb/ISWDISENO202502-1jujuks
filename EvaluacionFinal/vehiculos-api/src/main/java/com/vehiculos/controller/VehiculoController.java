package com.vehiculos.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehiculos.dto.VehiculoDTO;
import com.vehiculos.model.Vehiculo;
import com.vehiculos.service.VehiculoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/vehiculos")
@RequiredArgsConstructor
public class VehiculoController {
    
    private final VehiculoService vehiculoService;
    
    @PostMapping
    public ResponseEntity<Vehiculo> crearVehiculo(@Valid @RequestBody VehiculoDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(vehiculoService.crearVehiculo(dto));
    }
    
    @GetMapping
    public ResponseEntity<List<Vehiculo>> obtenerTodos() {
        return ResponseEntity.ok(vehiculoService.obtenerTodosLosVehiculos());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> obtenerPorId(@PathVariable String id) {
        return ResponseEntity.ok(vehiculoService.obtenerVehiculoPorId(id));
    }
    
    // ... Agrega PUT y DELETE delegando al servicio

    @PutMapping("/{id}")
    public ResponseEntity<Vehiculo> actualizarVehiculo(@PathVariable String id, @Valid @RequestBody VehiculoDTO dto) {
        return ResponseEntity.ok(vehiculoService.actualizarVehiculo(id, dto));
    }

    // Este es el bloque que te falta para que funcione el paso 4
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVehiculo(@PathVariable String id) {
        vehiculoService.eliminarVehiculo(id);
        return ResponseEntity.noContent().build();
    }
}