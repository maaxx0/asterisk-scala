package com.github.bespalovdn.asteriskscala.agi.command

/**
 * Answer channel if not already in answer state.
 * [[http://www.voip-info.org/wiki/view/answer]]
 */
object Answer extends AgiCommandImpl
{
    override def toString: String = "ANSWER"
}
