// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static wgslplugin.language.psi.WGSLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class WGSLSwitchStatementImpl extends ASTWrapperPsiElement implements WGSLSwitchStatement {

  public WGSLSwitchStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WGSLVisitor visitor) {
    visitor.visitSwitchStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WGSLVisitor) accept((WGSLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WGSLParenExpression getParenExpression() {
    return findNotNullChildByClass(WGSLParenExpression.class);
  }

  @Override
  @NotNull
  public List<WGSLSwitchBody> getSwitchBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WGSLSwitchBody.class);
  }

}
