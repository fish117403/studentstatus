package com.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/**
 * ����Բ�λ���Բ��ͼƬ
 *
 */
public class CreatePhoto {
	
	public Bitmap createFramedPhoto(int x, int y, Bitmap image, float outerRadiusRat) {
		
	   //����Դ�ļ��½�һ��drawable����  
       Drawable imageDrawable = new BitmapDrawable(image); 

       // �½�һ���µ����ͼƬ  
       Bitmap output = Bitmap.createBitmap(x, y, Bitmap.Config.ARGB_8888); 
       Canvas canvas = new Canvas(output); 

       // �½�һ������  
       RectF outerRect = new RectF(0, 0, x, y); 

       // ����һ����ɫ��Բ�Ǿ���  
       Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG); 
       canvas.drawRoundRect(outerRect, outerRadiusRat, outerRadiusRat, paint); 
       
       // ��ԴͼƬ���Ƶ����Բ�Ǿ�����  
       paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN)); 
       imageDrawable.setBounds(0, 0, x, y); 
       canvas.saveLayer(outerRect, paint, Canvas.ALL_SAVE_FLAG); 
       imageDrawable.draw(canvas); 
       canvas.restore(); 
       return output; 
   } 

}
