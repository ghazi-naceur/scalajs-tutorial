package gn.scalajs.tutorial

import org.scalajs.dom
import org.scalajs.dom.{MouseEvent, document}

import scala.scalajs.js.annotation.JSExportTopLevel

object Main {

  def appendParagraphTag(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

//  @JSExportTopLevel("addClickedMessage") // commented as html code is commented as well. Work together.
  def addClickedMessage(): Unit = {
    appendParagraphTag(document.body, "You clicked the button!")
  }

  def main(args: Array[String]): Unit = {
//    println("Hello world!") // Inspect element. See JS Console.

//    appendParagraphTag(document.body, "Hello world!")
    document.addEventListener(
      "DOMContentLoaded",
      { (e: dom.Event) =>
        setupUI()
      }
    )
  }

  def setupUI(): Unit = {
    val button = document.createElement("button")
    button.textContent = "Click"
    button.addEventListener(
      "click",
      { (e: MouseEvent) =>
        addClickedMessage()
      }
    )
    document.body.appendChild(button)
    appendParagraphTag(document.body, "Hello world!")
  }
}
