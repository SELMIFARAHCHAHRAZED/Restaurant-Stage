package RestaurantProject.spring.Services;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import RestaurantProject.spring.Entities.Filee;
import RestaurantProject.spring.Reposetory.FilleeRepository;

@Service
public class FileeServices  implements IfileeServices{
  @Autowired
  FilleeRepository filerep; 
	@Override
	public Filee uploadFilee(MultipartFile file) throws IOException {
		
		String path="C:/Users/user/Desktop/Restauarant/Restaurant/src/img";
		System.out.println("Original Image Byte Size - " + file.getBytes().length);
		Filee img = new Filee(file.getOriginalFilename(), file.getContentType(),
				compressBytes(file.getBytes()));
		File f= new File(path+"/"+file.getName());
		OutputStream f1 = new FileOutputStream(f);
		f1.close();
		return filerep.save(img);
	}
	// compress the image bytes before storing it in the database
		public static byte[] compressBytes(byte[] data) {
			Deflater deflater = new Deflater();
			deflater.setInput(data);
			deflater.finish();

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
			byte[] buffer = new byte[1024];
			while (!deflater.finished()) {
				int count = deflater.deflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			try {
				outputStream.close();
			} catch (IOException e) {
			}
			System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

			return outputStream.toByteArray();
		}

		// uncompress the image bytes before returning it to the angular application
		public static byte[] decompressBytes(byte[] data) {
			Inflater inflater = new Inflater();
			inflater.setInput(data);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
			byte[] buffer = new byte[1024];
			try {
				while (!inflater.finished()) {
					int count = inflater.inflate(buffer);
					outputStream.write(buffer, 0, count);
				}
				outputStream.close();
			} catch (IOException ioe) {
			} catch (DataFormatException e) {
			}
			return outputStream.toByteArray();
		}
	

}
