package io.subbu.chat.grammer.visitors;

import io.subbu.chat.grammer.ChatBaseVisitor;
import io.subbu.chat.grammer.ChatParser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChatLangVisitor extends ChatBaseVisitor<Object> {


    private String htmlDoc;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitChat(ChatParser.ChatContext ctx) {
        log.info("visitChat - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitChat(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitLine(ChatParser.LineContext ctx) {
        log.info("visitLine - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitLine(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitMessage(ChatParser.MessageContext ctx) {
        log.info("visitMessage - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitMessage(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitName(ChatParser.NameContext ctx) {
        log.info("visitName - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitName(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitCommand(ChatParser.CommandContext ctx) {
        log.info("visitCommand - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitCommand(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitEmoticon(ChatParser.EmoticonContext ctx) {
        log.info("visitEmoticon - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitEmoticon(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitLink(ChatParser.LinkContext ctx) {
        log.info("visitLink - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitLink(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitColor(ChatParser.ColorContext ctx) {
        log.info("visitColor - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitColor(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitMention(ChatParser.MentionContext ctx) {
        log.info("visitMention - [{}] with payload - [{}]", ctx.getText(), ctx.getPayload().getText());
        return super.visitMention(ctx);
    }
}
