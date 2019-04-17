package com.video;

import com.xuggle.xuggler.ICodec;
import com.xuggle.xuggler.IContainer;
import com.xuggle.xuggler.IStream;
import com.xuggle.xuggler.IStreamCoder;

public class VideoInfo {
public static String getLength(long milliseconds){
	
	long minutes = (milliseconds / 1000) / 60;
    long seconds = (milliseconds / 1000) % 60;

    
    System.out.format("%d Milliseconds = %d minutes and %d seconds.", milliseconds, minutes, seconds);
    return minutes+":"+ seconds;
}
	private static final String filename = "D:/mobile/Udemy/AIpython/WebHD_720p (1).mp4";

	public static void main(String[] args) {



		// first we create a Xuggler container object

		IContainer container = IContainer.make();

		// we attempt to open up the container

		int result = container.open(filename, IContainer.Type.READ, null);

		// check if the operation was successful

		if (result < 0)

			throw new RuntimeException("Failed to open media file");

		// query how many streams the call to open found

		int numStreams = container.getNumStreams();

		// query for the total duration

		long duration = container.getDuration();

		// query for the file size

		long fileSize = container.getFileSize();

		// query for the bit rate


		System.out.println("File Size (bytes): " +( fileSize / 1024));
		
		//06:58


		System.out.println("Duration (ms): " + getLength(duration));

		System.out.println("File Size (bytes): " + fileSize);

		
		// iterate through the streams to print their meta data

		for (int i = 0; i < numStreams; i++) {

			// find the stream object

			IStream stream = container.getStream(i);

			// get the pre-configured decoder that can decode this stream;

			IStreamCoder coder = stream.getStreamCoder();

			System.out.println("*** Start of Stream Info ***");

			System.out.printf("stream %d: ", i);

			System.out.printf("type: %s; ", coder.getCodecType());


			System.out.printf("duration: %s; ",  getLength(stream.getDuration()));

			

			
			System.out.println();

			System.out.println("*** End of Stream Info ***");

		}

	}

}
