// This is a generated file. Not intended for manual editing.
package wgslplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static wgslplugin.language.psi.WGSLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import wgslplugin.language.psi.*;

public class WGSLFunctionDeclImpl extends ASTWrapperPsiElement implements WGSLFunctionDecl {

  public WGSLFunctionDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WGSLVisitor visitor) {
    visitor.visitFunctionDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WGSLVisitor) accept((WGSLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WGSLAttributeList getAttributeList() {
    return findChildByClass(WGSLAttributeList.class);
  }

  @Override
  @NotNull
  public WGSLCompoundStatement getCompoundStatement() {
    return findNotNullChildByClass(WGSLCompoundStatement.class);
  }

  @Override
  @Nullable
  public WGSLDocs getDocs() {
    return findChildByClass(WGSLDocs.class);
  }

  @Override
  @NotNull
  public WGSLFunctionHeader getFunctionHeader() {
    return findNotNullChildByClass(WGSLFunctionHeader.class);
  }

}
