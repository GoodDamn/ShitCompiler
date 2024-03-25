package lexicon.tokens.operatorOrPunctuatorTokens

import lexicon.tokens.Token
import lexicon.tokens.TokenTypes

data class OperatorOrPunctuatorToken(
    val operatorOrPunctuatorType:OperatorOrPunctuatorType
) : Token(TokenTypes.OPERATOR_OR_PUNCTUATOR) {

}