package utils;

/**
 * Helper class.
 * 
 * Classe que donada una posició del tauler en forma de 'String' permet
 * consultar la fila i la columna que indica en forma de enter.
 * 
 * @author Bernat Galmés Rubert
 */
public class PositionCode {
    private String positionCode;

    public PositionCode(String positionCode) {
        this.positionCode = positionCode;
    }
    
    public int getRow()
    {
        return Character.getNumericValue(this.positionCode.charAt(1));
    }
    
    public int getColumn(){
        return this.positionCode.charAt(0) - 64;
    }
}
