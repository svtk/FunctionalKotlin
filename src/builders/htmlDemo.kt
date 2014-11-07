package builders.demo

import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JLabel
import javax.swing.SwingConstants.*
import builders.renderProductTable


fun main(args: Array<String>) {
    with (JFrame("Product popularity")) {
        setSize(600, 600)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        add(JScrollPane(JLabel(renderProductTable(), CENTER)))
        setVisible(true)
    }
}

