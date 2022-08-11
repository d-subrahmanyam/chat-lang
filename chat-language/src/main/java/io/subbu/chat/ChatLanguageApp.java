package io.subbu.chat;

import io.subbu.chat.grammer.ChatLexer;
import io.subbu.chat.grammer.ChatParser;
import io.subbu.chat.grammer.listeners.ChatLangListener;
import io.subbu.chat.grammer.visitors.ChatLangVisitor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ChatLanguageApp {

    private static final String TEST_FILE_NAME = "chat";
    private static final String SEPARATOR = ".";
    private static final String EXTENSION = "lang";
    private static final String DIRBASE = "src/test/resources/";

    private static final List<String> TEST_CHAT_LOG = List.of(
            "John SAYS: hello @michael this will not work\n",
            "Jane SHOUTS: tx @john. What do you say @michael :)\n");

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ TEST_FILE_NAME + SEPARATOR + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("START: " + file);

            //CharStream in = CharStreams.fromFileName(file);
            CharStream in = CharStreams.fromString(TEST_CHAT_LOG.stream().collect(Collectors.joining()));
            ChatLexer lexer = new ChatLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ChatParser parser = new ChatParser(tokens);
            ChatParser.ChatContext tree = parser.chat();
            ChatLangVisitor visitor = new ChatLangVisitor();
            visitor.visit(tree);
            //ChatLangListener chatLangListener = new ChatLangListener();
            //chatLangListener.

            System.out.println("FINISH: " + file);
        }
    }
}
