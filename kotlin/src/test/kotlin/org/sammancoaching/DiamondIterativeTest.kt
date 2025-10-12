package org.sammancoaching

import org.approvaltests.Approvals
import kotlin.test.Test


class DiamondIterativeTest {

    @Test
    fun testDiamonds() {
        val result = """
            Diamond A:
            ${Diamond('A').printDiamond()}
            
            Diamond B:
            ${Diamond('B').printDiamond()}
            
            Diamond C:
            ${Diamond('C').printDiamond()}
            
            Diamond D:
            ${Diamond('D').printDiamond()}
            """.trimIndent()
        Approvals.verify(result)
    }
}