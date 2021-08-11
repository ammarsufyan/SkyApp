package cek_validasi;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class OnlyLetter {
    
    public PlainDocument getOnlyLetter(){
        return new PlainDocument(){
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
                StringBuilder buffer = new StringBuilder();
                int s = 0;
                char[] dataInput = str.toCharArray();

                // Memeriksa semua data yang dimasukkan
                for (int i =0; i < dataInput.length; i++){
                    boolean isOnlyLetter = Character.isLetter(dataInput[i]);
                    boolean isSpace = Character.isSpaceChar(dataInput[i]);
                    if (isOnlyLetter || isSpace){
                        dataInput[s]=dataInput[i];
                        s++;
                    }
                }
                buffer.append(dataInput,0,s);
                super.insertString(offs, new String(buffer), a);
            }
        };
    }
}
