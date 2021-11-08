/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdatosdeestudiantes;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Abel del Aguila
 */
public class AddingObjectOutputStream extends ObjectOutputStream {
    public AddingObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException{
        reset();
    }
}
