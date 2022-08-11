package io.subbu.chat.grammer.listeners;

import io.subbu.chat.grammer.ChatBaseListener;
import io.subbu.chat.grammer.ChatParser;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

@Slf4j
public class ChatLangListener extends ChatBaseListener {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterChat(ChatParser.ChatContext ctx) {
        super.enterChat(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitChat(ChatParser.ChatContext ctx) {
        super.exitChat(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterLine(ChatParser.LineContext ctx) {
        super.enterLine(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitLine(ChatParser.LineContext ctx) {
        super.exitLine(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMessage(ChatParser.MessageContext ctx) {
        super.enterMessage(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMessage(ChatParser.MessageContext ctx) {
        super.exitMessage(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterName(ChatParser.NameContext ctx) {
        super.enterName(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitName(ChatParser.NameContext ctx) {
        super.exitName(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterCommand(ChatParser.CommandContext ctx) {
        super.enterCommand(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitCommand(ChatParser.CommandContext ctx) {
        super.exitCommand(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterEmoticon(ChatParser.EmoticonContext ctx) {
        super.enterEmoticon(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitEmoticon(ChatParser.EmoticonContext ctx) {
        super.exitEmoticon(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterLink(ChatParser.LinkContext ctx) {
        super.enterLink(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitLink(ChatParser.LinkContext ctx) {
        super.exitLink(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterColor(ChatParser.ColorContext ctx) {
        super.enterColor(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitColor(ChatParser.ColorContext ctx) {
        super.exitColor(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMention(ChatParser.MentionContext ctx) {
        super.enterMention(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMention(ChatParser.MentionContext ctx) {
        super.exitMention(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
        log.info("Processing - {}", ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param node
     */
    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
        log.info("Processing - {}", node.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param node
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
        log.info("Processing - {}", node.getText());
    }
}
