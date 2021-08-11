package cek_validasi;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class OnlyDigit {

    public PlainDocument getOnlyDigit(){

        return new PlainDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException
            {
                StringBuilder buffer = new StringBuilder();
                int s = 0;
                char[] dataInput = str.toCharArray();
                int len = dataInput.length;

                // Memeriksa semua data yang dimasukkan
                for (int i=0; i < len; i++){
                    // Menyaring apakah data masukkan berupa DIGIT
                    boolean isOnlyDigit = Character.isDigit(dataInput[i]);
                    if (isOnlyDigit){
                        dataInput[s] = dataInput[i];
                        s++;
                    }
                }
                buffer.append(dataInput,0,s);
                super.insertString(offs, new String(buffer), a);
            }
        };
    }
}
