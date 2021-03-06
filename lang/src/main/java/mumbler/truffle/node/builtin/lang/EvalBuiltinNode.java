package mumbler.truffle.node.builtin.lang;

import mumbler.truffle.node.MumblerNode;
import mumbler.truffle.node.builtin.BuiltinNode;
import mumbler.truffle.parser.Converter;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName="eval")
@GenerateNodeFactory
public abstract class EvalBuiltinNode extends BuiltinNode {
    // TODO: Change to take second namespace (Frame) argument
//
//    @Specialization
//    public Object eval(VirtualFrame virtualFrame, Object form) {
//        Converter converter = new Converter();
//        MumblerNode node = this.insert(converter.convert(
//                form, this.getNamespace()));
//        return node.execute(virtualFrame);
//    }
}
