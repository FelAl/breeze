package breeze.io

import java.io.File

import breeze.linalg.DenseMatrix
import org.scalatest.FunSuite

class ImageIOTest extends FunSuite {

  test("Image IO write") {}

  test("Image IO read") {
    val pathToImage = getClass.getResource("/grayscale.png").getPath
    println(pathToImage)
    val result: DenseMatrix[Byte] = ImageIO.read(new File(pathToImage))
    println("result")
    println(result.data.size)

  }

  test("getGrayscaleBufferedImage") {}

}
